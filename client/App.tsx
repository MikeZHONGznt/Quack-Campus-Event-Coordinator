import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

/**
 * Placeholder home screen. Its only job is to prove a fresh clone installs and runs.
 *
 * The map replaces this in story #19, which is also where the Mapbox native module and the
 * development build come in. Nothing here yet is a feature.
 */
export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Quack!</Text>
      <Text style={styles.body}>Client environment is set up.</Text>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    alignItems: 'center',
    backgroundColor: '#fff',
    flex: 1,
    gap: 8,
    justifyContent: 'center',
  },
  title: {
    fontSize: 28,
    fontWeight: '700',
  },
  body: {
    color: '#444',
  },
});
