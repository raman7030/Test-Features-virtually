package p067l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.alipay.sdk.p010m.p014b0.C0087a;
import com.alipay.sdk.p010m.p041p.C0187d;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩹᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23800 {

    /* JADX INFO: renamed from: ֫ */
    public KeyStore f75669;

    /* JADX INFO: renamed from: ۧ */
    public SharedPreferences f75670;

    public C23800(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("KEYSTORE_SETTING", 0);
            this.f75670 = sharedPreferences;
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f75669 = keyStore;
            keyStore.load(null);
            if (keyStore.containsAlias("KEYSTORE_AES")) {
                return;
            }
            sharedPreferences.edit().putString("PREF_KEY_IV", "").apply();
            m52892(context);
            m52891();
        } catch (Exception e) {
            C11060.m25463(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52892(Context context) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        StringBuilder sb = new StringBuilder("Build.VERSION.SDK_INT=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        C11060.m25464("KEYSTORE", sb.toString());
        if (i >= 23) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(C0187d.f883a, "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("KEYSTORE_AES", 3).setDigests(XMSSKeyParameters.SHA_256, XMSSKeyParameters.SHA_512).setEncryptionPaddings("PKCS1Padding").build());
            keyPairGenerator.generateKeyPair();
        } else {
            KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance(C0187d.f883a, "AndroidKeyStore");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            keyPairGenerator2.initialize(new KeyPairGeneratorSpec.Builder(context).setAlias("KEYSTORE_AES").setSubject(new X500Principal("CN=KEYSTORE_AES")).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build());
            keyPairGenerator2.generateKeyPair();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52894(String str) {
        try {
            Cipher cipher = Cipher.getInstance(C0087a.f317f);
            cipher.init(1, m52893(), new IvParameterSpec(Base64.decode(this.f75670.getString("PREF_KEY_IV", ""), 0)));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            C11060.m25465("KEYSTORE", "Exception", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52891() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(secureRandom.generateSeed(12), 0);
        SharedPreferences sharedPreferences = this.f75670;
        sharedPreferences.edit().putString("PREF_KEY_IV", strEncodeToString).apply();
        PublicKey publicKey = this.f75669.getCertificate("KEYSTORE_AES").getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        sharedPreferences.edit().putString("PREF_KEY_AES", Base64.encodeToString(cipher.doFinal(bArr), 0)).apply();
    }

    /* JADX INFO: renamed from: ۧ */
    private SecretKeySpec m52893() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String string = this.f75670.getString("PREF_KEY_AES", "");
        PrivateKey privateKey = (PrivateKey) this.f75669.getKey("KEYSTORE_AES", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), C0087a.f317f);
    }
}
