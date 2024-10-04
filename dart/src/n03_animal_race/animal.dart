import 'dart:math';

abstract class Animal {
  Animal(this.name, this._minSpeed, this._maxSpeed, this._stamina);

  final String name;
  final double _minSpeed;
  final double _maxSpeed;
  final int _stamina;

  double move() => (Random().nextDouble()
      * (this._maxSpeed - this._minSpeed) + this._minSpeed)
      * (10 / this._stamina);

  void makeNoise();
}
