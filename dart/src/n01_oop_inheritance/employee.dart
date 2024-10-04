import 'person.dart';

class Employee extends Person {
  Employee(super.name, super.birthPlace, super.birthDate, this.personnelNumber, this.manager, this.salary);

  final int personnelNumber;
  final bool manager;
  final double salary;
}
