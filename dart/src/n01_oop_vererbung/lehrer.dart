import 'person.dart';

class Lehrer extends Person {
  Lehrer(super.name, super.gebOrt, super.gebDat, this.hauptfach);

  final String hauptfach;
}
