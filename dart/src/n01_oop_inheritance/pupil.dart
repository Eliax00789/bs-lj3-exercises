import 'person.dart';

class Pupil extends Person {
  Pupil(super.name, super.birthPlace, super.birthDate, this.education, this.gradeAverage);

  final String education;
  final double gradeAverage;
}
