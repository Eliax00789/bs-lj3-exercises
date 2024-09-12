import 'person.dart';

class Mitarbeiter extends Person {
  Mitarbeiter(super.name, super.gebOrt, super.gebDat, this.personalNummer, this.fuehrungskraft, this.gehalt);

  final int personalNummer;
  final bool fuehrungskraft;
  final double gehalt;
}
