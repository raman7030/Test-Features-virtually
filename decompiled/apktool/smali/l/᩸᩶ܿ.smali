.class public final Ll/᩸᩶ܿ;
.super Ll/ۜۖܽ;
.source "N17O"


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Z

.field public final ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 305
    invoke-direct {p0, p1}, Ll/ۜۖܽ;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 306
    iput-object p2, p0, Ll/᩸᩶ܿ;->۬:Ljava/lang/String;

    .line 307
    iput-object p3, p0, Ll/᩸᩶ܿ;->ۗ:Ljava/lang/String;

    .line 308
    iput-boolean p4, p0, Ll/᩸᩶ܿ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 330
    iget-object v0, p0, Ll/᩸᩶ܿ;->ۗ:Ljava/lang/String;

    const-string v1, "r"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    :try_start_0
    invoke-super {p0}, Ll/ۜۖܽ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    .line 337
    :cond_0
    invoke-super {p0}, Ll/ۜۖܽ;->close()V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 313
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Ll/᩸᩶ܿ;->۬:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 3

    .line 325
    iget-boolean v0, p0, Ll/᩸᩶ܿ;->ۙ:Z

    invoke-static {v0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v0

    iget-object v1, p0, Ll/᩸᩶ܿ;->۬:Ljava/lang/String;

    iget-object v2, p0, Ll/᩸᩶ܿ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ll/᩵᩶ܿ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object v0

    return-object v0
.end method
