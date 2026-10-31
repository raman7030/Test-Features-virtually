.class public final Ll/ۤ۟֡;
.super Ll/۠۬֡;
.source "R4MA"


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ۤ۟֡;->᩸:Ll/۬ۛ֡;

    .line 53
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p1

    iput p1, p0, Ll/ۤ۟֡;->᩹:I

    .line 54
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ۤ۟֡;->᩶:I

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 65
    invoke-static {p2}, Ll/ۤ᩵ۚ;->֫(Ll/ᩴۨ֡;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/util/List;
    .locals 4

    .line 72
    new-instance v0, Ll/۫۟֡;

    iget v1, p0, Ll/ۤ۟֡;->᩶:I

    iget v2, p0, Ll/ۤ۟֡;->᩹:I

    iget-object v3, p0, Ll/ۤ۟֡;->᩸:Ll/۬ۛ֡;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/۫۟֡;-><init>(Ll/ۤ۟֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method
