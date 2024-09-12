import 'mitarbeiter.dart';

class Azubi extends Mitarbeiter {
  Azubi(super.name, super.gebOrt, super.gebDat, super.personalNummer, super.fuehrungskraft, super.gehalt, this.lehrjahr);

  final int lehrjahr;
}
