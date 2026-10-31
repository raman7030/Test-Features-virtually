.class public final Ll/ۗۜᩳ;
.super Ljava/io/OutputStream;
.source "O6WV"


# instance fields
.field public final synthetic ᩸:Ll/۬ۜᩳ;


# direct methods
.method public constructor <init>(Ll/۬ۜᩳ;)V
    .locals 0

    .line 220
    iput-object p1, p0, Ll/ۗۜᩳ;->᩸:Ll/۬ۜᩳ;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 3

    .line 223
    iget-object v0, p0, Ll/ۗۜᩳ;->᩸:Ll/۬ۜᩳ;

    invoke-static {v0}, Ll/۬ۜᩳ;->֫(Ll/۬ۜᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 226
    :cond_0
    invoke-static {v0}, Ll/۬ۜᩳ;->ۧ(Ll/۬ۜᩳ;)Ll/֡ܺᩴ;

    move-result-object v1

    iget v1, v1, Ll/֡ܺᩴ;->᩹:I

    const/high16 v2, 0x800000

    if-lt v1, v2, :cond_1

    .line 227
    invoke-static {v0}, Ll/۬ۜᩳ;->ܽ(Ll/۬ۜᩳ;)V

    return-void

    .line 230
    :cond_1
    invoke-static {v0}, Ll/۬ۜᩳ;->ۧ(Ll/۬ۜᩳ;)Ll/֡ܺᩴ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡ܺᩴ;->write(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 3

    .line 235
    iget-object v0, p0, Ll/ۗۜᩳ;->᩸:Ll/۬ۜᩳ;

    invoke-static {v0}, Ll/۬ۜᩳ;->֫(Ll/۬ۜᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 238
    :cond_0
    invoke-static {v0}, Ll/۬ۜᩳ;->ۧ(Ll/۬ۜᩳ;)Ll/֡ܺᩴ;

    move-result-object v1

    iget v1, v1, Ll/֡ܺᩴ;->᩹:I

    const/high16 v2, 0x800000

    sub-int/2addr v2, v1

    if-le p3, v2, :cond_1

    .line 239
    invoke-static {v0}, Ll/۬ۜᩳ;->ܽ(Ll/۬ۜᩳ;)V

    return-void

    .line 242
    :cond_1
    invoke-static {v0}, Ll/۬ۜᩳ;->ۧ(Ll/۬ۜᩳ;)Ll/֡ܺᩴ;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ll/֡ܺᩴ;->write([BII)V

    return-void
.end method
