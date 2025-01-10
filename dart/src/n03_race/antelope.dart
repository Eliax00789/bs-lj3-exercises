import 'animal.dart';

class Antelope extends Animal {
  Antelope() : super('Antelope', 20, 80, 40);

  @override
  void makeNoise() {
    print('snort');
  }
  
  void jump() {
    print('yeeeee');
  }
}
