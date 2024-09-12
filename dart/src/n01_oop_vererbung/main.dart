import 'azubi.dart';
import 'lehrer.dart';
import 'mitarbeiter.dart';
import 'person.dart';
import 'schueler.dart';

void main() {
  final Person person = new Person('Max Mustermann', 'Musterstadt', 'Musterdatum');
  final Lehrer lehrer = new Lehrer('Max Mustermann', 'Musterstadt', 'Musterdatum', 'Musterfach');
  final Schueler schueler = new Schueler('Max Mustermann', 'Musterstadt', 'Musterdatum', 'Musterbildungsabschluss', 1);
  final Mitarbeiter mitarbeiter = new Mitarbeiter('Max Mustermann', 'Musterstadt', 'Musterdatum', 1234, false, -5);
  final Azubi azubi = new Azubi('Max Mustermann', 'Musterstadt', 'Musterdatum', 1234, false, -10, 3);
}
