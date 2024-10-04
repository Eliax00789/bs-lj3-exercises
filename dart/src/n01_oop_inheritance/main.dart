import 'apprentice.dart';
import 'employee.dart';
import 'person.dart';
import 'pupil.dart';
import 'teacher.dart';

void main() {
  final Person person = Person('John Doe', 'Example city', 'Example date');
  final Teacher teacher = Teacher('John Doe', 'Example city', 'Example date', 'Example subject');
  final Pupil pupil = Pupil('John Doe', 'Example city', 'Example date', 'Example education', 1);
  final Employee employee = Employee('John Doe', 'Example city', 'Example date', 1234, false, -5);
  final Apprentice apprentice = Apprentice('John Doe', 'Example city', 'Example date', 1234, false, -10, 3);
}
