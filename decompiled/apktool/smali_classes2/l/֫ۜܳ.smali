.class public abstract Ll/֫ۜܳ;
.super Ljava/lang/Object;
.source "L4NY"


# instance fields
.field public ۙ:I

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:Ll/֫ۜܳ;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput p1, p0, Ll/֫ۜܳ;->ۙ:I

    .line 140
    iput p2, p0, Ll/֫ۜܳ;->᩸:I

    return-void
.end method

.method public static ֫(Ll/ۖۢܳ;I)Ljava/lang/String;
    .locals 5

    .line 227
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    .line 230
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 231
    invoke-virtual {p0}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    .line 232
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽۢܳ;->᩶()Ljava/lang/String;

    move-result-object p0

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    aput-object v0, v3, v4

    aput-object p0, v3, v1

    const p0, 0x7f1203b4

    .line 229
    invoke-static {p0, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 235
    :cond_0
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 236
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 237
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽۢܳ;->᩶()Ljava/lang/String;

    move-result-object p0

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    aput-object v0, v3, v4

    aput-object p0, v3, v1

    const p0, 0x7f1203b3

    .line 234
    invoke-static {p0, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܳ(Ll/ۖۢܳ;)Ljava/lang/String;
    .locals 5

    .line 214
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const v3, 0x7f1205ca

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    .line 217
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 218
    invoke-virtual {p0}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    aput-object p0, v2, v4

    const p0, 0x7f1203b2

    .line 216
    invoke-static {p0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 221
    :cond_0
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 222
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    aput-object v0, v2, v4

    const p0, 0x7f1203b1

    .line 220
    invoke-static {p0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;
    .locals 1

    .line 201
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 202
    invoke-virtual {v0, p2}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 203
    invoke-virtual {v0, p3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/۟᩻ܳ;

    invoke-direct {p2, p0, p1}, Ll/۟᩻ܳ;-><init>(Ll/֫ۜܳ;Ll/ۖۢܳ;)V

    const p1, 0x7f12070a

    .line 204
    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p2, 0x0

    .line 205
    invoke-virtual {v0, p1, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 206
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/֫ۜܳ;)Ll/֫ۜܳ;
    .locals 0

    .line 144
    iput-object p1, p0, Ll/֫ۜܳ;->᩹:Ll/֫ۜܳ;

    return-object p0
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 149
    iput-boolean v0, p0, Ll/֫ۜܳ;->᩶:Z

    return-void
.end method

.method public final ֫(Ll/ۖۢܳ;)Z
    .locals 1

    .line 153
    iget-boolean v0, p0, Ll/֫ۜܳ;->᩶:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 155
    :cond_0
    invoke-virtual {p0, p1}, Ll/֫ۜܳ;->ᩳ(Ll/ۖۢܳ;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۖۢܳ;Z)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 185
    invoke-virtual {p0, p1}, Ll/֫ۜܳ;->ۧ(Ll/ۖۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 186
    iget-object p2, p0, Ll/֫ۜܳ;->᩹:Ll/֫ۜܳ;

    invoke-virtual {p2, p1}, Ll/֫ۜܳ;->ܽ(Ll/ۖۢܳ;)V

    return v0

    .line 190
    :cond_0
    invoke-virtual {p0, p1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 191
    invoke-virtual {p0, p1}, Ll/֫ۜܳ;->ܽ(Ll/ۖۢܳ;)V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 180
    iget v0, p0, Ll/֫ۜܳ;->᩸:I

    return v0
.end method

.method public final ۧ(Ll/ۖۢܳ;)Z
    .locals 1

    .line 159
    iget-object v0, p0, Ll/֫ۜܳ;->᩹:Ll/֫ۜܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 162
    :cond_0
    iget-boolean v0, v0, Ll/֫ۜܳ;->᩶:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 164
    :cond_1
    iget-object v0, p0, Ll/֫ۜܳ;->᩹:Ll/֫ۜܳ;

    invoke-virtual {v0, p1}, Ll/֫ۜܳ;->ᩳ(Ll/ۖۢܳ;)Z

    move-result p1

    return p1
.end method

.method public abstract ܽ(Ll/ۖۢܳ;)V
.end method

.method public ܿ(Ll/ۖۢܳ;)V
    .locals 1

    .line 210
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Please override method onQueryOK()"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ()Z
    .locals 1

    .line 172
    iget-boolean v0, p0, Ll/֫ۜܳ;->᩶:Z

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 176
    iget v0, p0, Ll/֫ۜܳ;->ۙ:I

    return v0
.end method

.method public ᩳ(Ll/ۖۢܳ;)Z
    .locals 0

    .line 0
    instance-of p1, p0, Ll/ܶۚܳ;

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
