.class public final Ll/ܶܶܽ;
.super Ljava/lang/Object;
.source "21YS"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 142
    iput-boolean v0, p0, Ll/ܶܶܽ;->ܽ:Z

    .line 143
    iput-boolean v0, p0, Ll/ܶܶܽ;->ۧ:Z

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Ll/ܶܶܽ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳܰۡ;)V
    .locals 7

    const-string v0, "AndroidManifest.xml"

    .line 150
    invoke-virtual {p1, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 151
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v2

    const-wide/32 v4, 0x500000

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    goto :goto_0

    .line 157
    :cond_0
    :try_start_0
    invoke-virtual {p1, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p1

    .line 158
    invoke-static {p1}, Ll/᩹ۨۡ;->ܳ(Ll/ܶۨۡ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܶܶܽ;->ܽ:Z

    .line 159
    invoke-static {p1}, Ll/᩹ۨۡ;->ܿ(Ll/ܶۨۡ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܶܶܽ;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 161
    :catchall_0
    iput-boolean v1, p0, Ll/ܶܶܽ;->ܽ:Z

    .line 162
    iput-boolean v1, p0, Ll/ܶܶܽ;->ۧ:Z

    return-void

    .line 152
    :cond_1
    :goto_0
    iput-boolean v1, p0, Ll/ܶܶܽ;->ܽ:Z

    .line 153
    iput-boolean v1, p0, Ll/ܶܶܽ;->ۧ:Z

    return-void
.end method

.method public final ֫([B)V
    .locals 1

    .line 172
    :try_start_0
    invoke-static {p1}, Ll/ܶۨۡ;->ۧ([B)Ll/ܶۨۡ;

    move-result-object p1

    .line 173
    invoke-static {p1}, Ll/᩹ۨۡ;->ܳ(Ll/ܶۨۡ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܶܶܽ;->ܽ:Z

    .line 174
    invoke-static {p1}, Ll/᩹ۨۡ;->ܿ(Ll/ܶۨۡ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܶܶܽ;->ۧ:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 176
    iput-boolean p1, p0, Ll/ܶܶܽ;->ܽ:Z

    .line 177
    iput-boolean p1, p0, Ll/ܶܶܽ;->ۧ:Z

    return-void
.end method
