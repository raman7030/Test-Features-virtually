.class public final Ll/ۚۚ᩻;
.super Ll/ۗ᩻᩻;
.source "NA5M"


# static fields
.field public static final ܳ֫:Ll/ܿ۟᩵;

.field public static final ᩻֫:Ll/ܿ۟᩵;


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public ۧ֫:Z

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 346
    new-instance v0, Ll/ᩳ۟᩵;

    invoke-direct {v0}, Ll/ᩳ۟᩵;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x4e20

    .line 347
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->֫(JLjava/util/concurrent/TimeUnit;)V

    const-wide/32 v2, 0xea60

    .line 348
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->ۧ(JLjava/util/concurrent/TimeUnit;)V

    const-wide/32 v2, 0x1d4c0

    .line 349
    invoke-virtual {v0, v2, v3, v1}, Ll/ᩳ۟᩵;->ܽ(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Ll/۟֨ۢ;

    invoke-direct {v1}, Ll/۟֨ۢ;-><init>()V

    .line 350
    invoke-virtual {v0, v1}, Ll/ᩳ۟᩵;->֫(Ljavax/net/SocketFactory;)V

    new-instance v1, Ll/ۛۚ᩷;

    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 351
    invoke-virtual {v0, v1}, Ll/ᩳ۟᩵;->֫(Ll/᩺ܰ᩵;)V

    .line 354
    invoke-virtual {v0}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v0

    sput-object v0, Ll/ۚۚ᩻;->ܳ֫:Ll/ܿ۟᩵;

    .line 360
    :try_start_0
    new-instance v1, Ll/֡ۚ᩻;

    .line 361
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Ljavax/net/ssl/TrustManager;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "SSL"

    .line 376
    invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v1

    .line 377
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v2, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 378
    invoke-virtual {v0}, Ll/ܿ۟᩵;->ۖ()Ll/ᩳ۟᩵;

    move-result-object v0

    new-instance v4, Ll/ܰ֨ۢ;

    .line 379
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    invoke-direct {v4, v1}, Ll/ܰ֨ۢ;-><init>(Ljavax/net/ssl/SSLSocketFactory;)V

    aget-object v1, v2, v3

    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0, v4, v1}, Ll/ᩳ۟᩵;->֫(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    new-instance v1, Ll/ܺۚ᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 380
    invoke-virtual {v0, v1}, Ll/ᩳ۟᩵;->֫(Ll/ܺۚ᩻;)V

    .line 381
    invoke-virtual {v0}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v0

    sput-object v0, Ll/ۚۚ᩻;->᩻֫:Ll/ܿ۟᩵;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 383
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(I)V

    const-string p1, ""

    .line 49
    iput-object p1, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    .line 50
    iput-object p1, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    .line 52
    iput-object p1, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    const/4 p1, 0x0

    .line 53
    iput-boolean p1, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 2

    const-string v0, "rk"

    const-string v1, "2"

    .line 70
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ip"

    const-string v1, "5"

    .line 71
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hs"

    const-string v1, "7"

    .line 72
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mt"

    const-string v1, "8"

    .line 73
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, ""

    .line 49
    iput-object v0, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    const-string v1, "1"

    .line 61
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۚۚ᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    const-string v1, "3"

    .line 62
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    const-string v1, "4"

    .line 63
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    const-string v1, "9"

    .line 64
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    const-string v0, "6"

    .line 65
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    return-void
.end method

.method public static synthetic ֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۚۚ᩻;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)Ll/ۚۚ᩻;
    .locals 2

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 235
    invoke-static {v0}, Ll/ۚۚ᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f1206d2

    .line 423
    invoke-static {p0, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    new-instance v0, Ll/ۚۚ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۚۚ᩻;-><init>(I)V

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 238
    iput-object p0, v0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 239
    iput-object p0, v0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 240
    iput-object p0, v0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 241
    iput-object p0, v0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 242
    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 371
    invoke-virtual {p5}, Landroid/widget/TextView;->length()I

    move-result p0

    if-lez p0, :cond_0

    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 243
    :cond_0
    iget-object p0, v0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-static {p0}, Ll/ۚۚ᩻;->ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    iput-object p0, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 244
    invoke-virtual {p6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۚۚ᩻;->ۧ֫:Z

    .line 245
    invoke-virtual {p7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->᩹:Z

    .line 246
    invoke-virtual {p8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 247
    invoke-virtual {v0, p9}, Ll/ۗ᩻᩻;->ۧ(Ll/ۗ᩻᩻;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/widget/EditText;Z)V
    .locals 0

    if-nez p1, :cond_0

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 205
    invoke-static {p1}, Ll/ۚۚ᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۖۚ᩻;Ll/ۚۚ᩻;Ll/֡ۚۢ;)V
    .locals 2

    .line 253
    invoke-virtual {p0}, Ll/ۖۚ᩻;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚۚ᩻;

    if-nez p0, :cond_0

    return-void

    .line 257
    :cond_0
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 258
    new-instance p1, Ll/ۚۚ᩻;

    invoke-static {}, Ll/ۗ᩻᩻;->᩷()I

    move-result v0

    invoke-direct {p1, v0}, Ll/ۚۚ᩻;-><init>(I)V

    .line 259
    invoke-virtual {p1, p0}, Ll/ۚۚ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 260
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    goto :goto_0

    .line 262
    :cond_1
    invoke-virtual {p1, p0}, Ll/ۚۚ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 263
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    .line 265
    :goto_0
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ۚۚ᩻;)V
    .locals 14

    const v0, 0x7f0d0093

    .line 179
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 180
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a066b

    .line 181
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/EditText;

    const v2, 0x7f0a0670

    .line 182
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/EditText;

    const v2, 0x7f0a0429

    .line 183
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/EditText;

    const v2, 0x7f0a0131

    .line 184
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/EditText;

    const v2, 0x7f0a04a5

    .line 185
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/EditText;

    const v2, 0x7f0a04a4

    .line 186
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/EditText;

    const v2, 0x7f0a0653

    .line 187
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ll/ۗۘ;

    const v2, 0x7f0a025f

    .line 188
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ll/ۗۘ;

    const v2, 0x7f0a03d2

    .line 189
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ll/ۗۘ;

    const v2, 0x7f0a062d

    .line 190
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {p0, v2, p1}, Ll/ۙ᩻᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/TextView;Ll/ۗ᩻᩻;)Ll/ۙ᩻᩻;

    move-result-object v13

    .line 192
    iget v2, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    const v2, 0x7f1205ad

    goto :goto_0

    :cond_0
    const v2, 0x7f1202dd

    :goto_0
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, " WebDav"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v1, p1, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v1, p1, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    iget-object v1, p1, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    iget-object v1, p1, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    iget-object v1, p1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    iget-object v1, p1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-boolean v1, p1, Ll/ۚۚ᩻;->ۧ֫:Z

    invoke-virtual {v10, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 200
    iget-boolean v1, p1, Ll/ۗ᩻᩻;->᩹:Z

    invoke-virtual {v11, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 201
    iget-boolean v1, p1, Ll/ۗ᩻᩻;->ۛ:Z

    invoke-virtual {v12, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 588
    new-instance v1, Ll/֫۬ܳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/֫۬ܳ;-><init>(I)V

    invoke-virtual {v12, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 203
    new-instance v1, Ll/᩷ۗܿ;

    invoke-direct {v1, v2, v4}, Ll/᩷ۗܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 208
    new-instance v1, Ll/ᩴۚ᩻;

    invoke-direct {v1, v10}, Ll/ᩴۚ᩻;-><init>(Ll/ۗۘ;)V

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 224
    new-instance v1, Ll/ۧۨ᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/ۧۨ᩷;-><init>(I)V

    invoke-static {v4, v9, v1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;Ljava/util/function/Function;)V

    .line 225
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f1205fc

    const/4 v2, 0x0

    .line 226
    invoke-virtual {v1, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 227
    invoke-virtual {v1, v0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f1206b8

    .line 228
    invoke-virtual {v1, v0, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v0, 0x0

    .line 229
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Z)V

    .line 230
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 231
    invoke-static {v0}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 232
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 234
    new-instance v1, Ll/ۖۚ᩻;

    move-object v3, v1

    invoke-direct/range {v3 .. v13}, Ll/ۖۚ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)V

    .line 252
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v2

    new-instance v3, Ll/ۢᩴܿ;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p1, v0, v4}, Ll/ۢᩴܿ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll/֡ۚۢ;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۘۚ᩻;

    invoke-direct {v0, v1, p0}, Ll/ۘۚ᩻;-><init>(Ll/ۖۚ᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 5

    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz v0, :cond_0

    const-string v4, "//"

    .line 3054
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v3, :cond_0

    add-int/lit8 v4, v4, 0x2

    .line 3056
    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    if-eq v1, v3, :cond_0

    .line 3058
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    const/16 v0, 0x3a

    .line 338
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v3, :cond_1

    const/4 v1, 0x0

    .line 340
    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    return-object p0

    :cond_2
    return-object v2
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 322
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 323
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "http://"

    .line 326
    invoke-static {v0, p0}, Ll/ۢܺ֡;->ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v1

    const-string v2, "https://"

    if-nez v1, :cond_1

    invoke-static {v2, p0}, Ll/ۢܺ֡;->ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 327
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۢܺ֡;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 329
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 332
    :cond_2
    invoke-static {p0}, Ll/ۢܺ֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 2

    .line 174
    new-instance v0, Ll/ۚۚ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۚۚ᩻;-><init>(I)V

    invoke-static {p0, v0}, Ll/ۚۚ᩻;->֫(Ll/ۗܺ᩷;Ll/ۚۚ᩻;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 131
    const-class v2, Ll/ۚۚ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 132
    :cond_1
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 134
    :cond_2
    check-cast p1, Ll/ۚۚ᩻;

    .line 135
    iget-boolean v2, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    iget-boolean v3, p1, Ll/ۚۚ᩻;->ۧ֫:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    .line 136
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    .line 137
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    .line 138
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    .line 139
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final getIcon()Ll/᩶ۖܳ;
    .locals 1

    .line 160
    sget-object v0, Ll/᩶ۖܳ;->۬֫:Ll/᩶ۖܳ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 144
    invoke-super {p0}, Ll/ۗ᩻᩻;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 145
    iget-object v2, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 146
    iget-object v2, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 147
    iget-object v2, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 148
    iget-object v2, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 149
    iget-boolean v1, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 79
    iget-object v0, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "adv:"

    if-eqz v0, :cond_0

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۢ᩻;
    .locals 2

    .line 155
    new-instance v0, Ll/۠ۚ᩻;

    invoke-virtual {p0}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/۠ۚ᩻;-><init>(ILl/ۗ᩻᩻;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 0

    .line 170
    invoke-static {p1, p0}, Ll/ۚۚ᩻;->֫(Ll/ۗܺ᩷;Ll/ۚۚ᩻;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻᩻;)V
    .locals 1

    .line 117
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 118
    instance-of v0, p1, Ll/ۚۚ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۚۚ᩻;

    .line 121
    iget-object v0, p1, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    .line 122
    iget-object v0, p1, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    .line 123
    iget-object v0, p1, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    .line 124
    iget-object v0, p1, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    .line 125
    iget-boolean p1, p1, Ll/ۚۚ᩻;->ۧ֫:Z

    iput-boolean p1, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    :cond_0
    return-void
.end method

.method public final ۢ()Ll/ܿ۟᩵;
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    if-eqz v0, :cond_0

    sget-object v0, Ll/ۚۚ᩻;->᩻֫:Ll/ܿ۟᩵;

    return-object v0

    :cond_0
    sget-object v0, Ll/ۚۚ᩻;->ܳ֫:Ll/ܿ۟᩵;

    return-object v0
.end method

.method public final ܳ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 91
    invoke-super {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "1"

    .line 92
    iget-object v2, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "3"

    .line 93
    iget-object v2, p0, Ll/ۚۚ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "4"

    .line 94
    iget-object v2, p0, Ll/ۚۚ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "6"

    .line 95
    iget-boolean v2, p0, Ll/ۚۚ᩻;->ۧ֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "9"

    .line 96
    iget-object v2, p0, Ll/ۚۚ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 3

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "webdav@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string v2, " "

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "WebDav"

    return-object v0
.end method
