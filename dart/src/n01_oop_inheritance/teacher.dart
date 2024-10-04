import 'person.dart';

class Teacher extends Person {
  Teacher(super.name, super.birthPlace, super.birthDate, this.mainSubject);

  final String mainSubject;
}
