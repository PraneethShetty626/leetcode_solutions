package main

import "strings"

type Solution struct{}

func (s *Solution) Encode(strs []string) string {
	var res strings.Builder

	for _, str := range strs {
		res.WriteRune('#')
		res.WriteRune('$')
		res.WriteString(str)
	}

	return res.String()
}

func (s *Solution) Decode(str string) []string {
	return strings.Split(str, "#$")
}
