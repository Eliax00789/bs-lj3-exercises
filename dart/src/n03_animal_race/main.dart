import 'dart:io';
import 'dart:math';

import 'animal.dart';
import 'antelope.dart';
import 'horse.dart';
import 'lion.dart';
import 'wolf.dart';

void main() {
  final Map<Animal, double> raceState = {
    Antelope(): 0,
    Horse(): 0,
    Lion(): 0,
    Wolf(): 0,
  };

  while_race:
  while (true) {
    for (final entry in raceState.entries) {
      final double newPosition = min(entry.value + entry.key.move(), 1000);
      raceState[entry.key] = newPosition;

      if (newPosition == 1000) {
        congratulate(entry.key);
        break while_race;
      }
    }
  }

  for (final entry in raceState.entries) {
    print('${entry.key.name}: ${entry.value}');
  }
}

void congratulate(final Animal animal) {
  print('Winner: ${animal.name}');
  stdout.write('Noise: ');
  animal.makeNoise();
  stdout.write('Custom: ');
  if (animal is Antelope) {
    animal.jump();
  } else if (animal is Horse) {
    animal.throwRider();
  }
  print('');
}
