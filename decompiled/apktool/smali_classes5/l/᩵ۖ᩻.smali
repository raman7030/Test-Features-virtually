.class public final Ll/᩵ۖ᩻;
.super Ll/ۚۖ᩻;
.source "H88G"


# static fields
.field public static final ֫:Ll/᩵ۖ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 301
    new-instance v0, Ll/᩵ۖ᩻;

    .line 303
    invoke-direct {v0}, Ll/ۚۖ᩻;-><init>()V

    .line 301
    sput-object v0, Ll/᩵ۖ᩻;->֫:Ll/᩵ۖ᩻;

    return-void
.end method

.method public static bridge synthetic ᩻()Ll/᩵ۖ᩻;
    .locals 1

    .line 0
    sget-object v0, Ll/᩵ۖ᩻;->֫:Ll/᩵ۖ᩻;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "Access Key ID"

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 378
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 10

    const v0, 0x7f120304

    move-object v8, p2

    .line 338
    invoke-static {p2, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v9, p3

    invoke-static {p3, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "^(https?://)?([a-z0-9]{32})\\.r2\\.cloudflarestorage\\.com"

    .line 341
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 342
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 343
    new-instance v0, Ll/ᩴۖ᩻;

    move-object v1, v0

    move-object v2, p1

    move-object v4, p1

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object v8, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Ll/ᩴۖ᩻;-><init>(Ll/ۗܺ᩷;Ljava/util/regex/Matcher;Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    const v1, 0x7f12019d

    .line 369
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۡ(I)V

    const v1, 0x7f12019e

    .line 370
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۜ(I)V

    .line 371
    invoke-virtual {v0}, Ll/۬ۗܿ;->᩹()V

    .line 372
    invoke-virtual {v0}, Ll/۬ۗܿ;->֫()V

    const/4 v1, 0x1

    .line 205
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Secret Access Key"

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "Cloudflare R2"

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    const-string v0, "r2"

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
