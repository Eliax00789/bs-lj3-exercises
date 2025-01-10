import 'animal.dart';

class Horse extends Animal {
  Horse() : super('Horse', 2, 80, 100);

  @override
  void makeNoise() {
    print('neigh');
  }

  void throwRider() {
    print('aaaaaaaaaaaaaaaaaaaaaaaa');
  }
}
