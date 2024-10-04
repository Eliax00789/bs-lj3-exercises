import 'animal.dart';

class Lion extends Animal {
  Lion() : super('Lion', 5, 60, 60);

  @override
  void makeNoise() {
    print('roar');
  }
}
