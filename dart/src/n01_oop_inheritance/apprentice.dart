import 'employee.dart';

class Apprentice extends Employee {
  Apprentice(super.name, super.birthPlace, super.birthDate, super.personnelNumber, super.manager, super.salary, this.yearOfApprenticeship);

  final int yearOfApprenticeship;
}
