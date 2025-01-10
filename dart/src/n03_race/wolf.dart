import 'animal.dart';

class Wolf extends Animal {
  Wolf() : super('Wolf', 8, 70, 50);

  @override
  void makeNoise() {
    print('howl');
  }
}
