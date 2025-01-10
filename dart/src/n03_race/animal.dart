import 'dart:math';

abstract class Animal {
  Animal(this.name, this._minSpeed, this._maxSpeed, this._stamina);

  final String name;
  final double _minSpeed;
  final double _maxSpeed;
  int _stamina;

  double move() {
    if (this._stamina == 0) {
      return this._minSpeed;
    } else {
      this._stamina--;
      return Random().nextDouble() * (this._maxSpeed - this._minSpeed) + this._minSpeed;
    }
  }

  void makeNoise();
}
