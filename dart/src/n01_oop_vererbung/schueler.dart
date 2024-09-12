import 'person.dart';

class Schueler extends Person {
  Schueler(super.name, super.gebOrt, super.gebDat, this.bildungsabschluss, this.notendurchschnitt);

  final String bildungsabschluss;
  final double notendurchschnitt;
}
