.class public final Ll/᩻֫ܽ;
.super Ll/ۤ۟ۧ;
.source "F6YU"


# instance fields
.field public final ᩳ:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ALGORITHMIC_DARKENING"

    .line 219
    invoke-direct {p0, v0, v0}, Ll/ۛ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "\\A\\d+"

    .line 439
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Ll/᩻֫ܽ;->ᩳ:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 3

    .line 443
    invoke-super {p0}, Ll/ۛ۟ۧ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 444
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    goto :goto_1

    .line 450
    :cond_0
    invoke-static {}, Ll/۠۟ۧ;->֫()Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 452
    :cond_1
    iget-object v1, p0, Ll/᩻֫ܽ;->ᩳ:Ljava/util/regex/Pattern;

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 453
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I

    move-result v2

    .line 454
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->end()I

    move-result v1

    .line 453
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x69

    if-lt v0, v1, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    :cond_3
    :goto_1
    return v0
.end method
