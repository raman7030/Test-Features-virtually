.class public final Ll/۬ܿ۠;
.super Ljava/lang/Object;
.source "X44P"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:Ll/᩷۠ᩴ;

.field public final ᩸:Ll/ۙܿ۠;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;Ll/ۙܿ۠;I)V
    .locals 0

    .line 1088
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1089
    iput-object p1, p0, Ll/۬ܿ۠;->᩶:Ll/᩷۠ᩴ;

    .line 1090
    iput-object p2, p0, Ll/۬ܿ۠;->᩸:Ll/ۙܿ۠;

    .line 1091
    iput p3, p0, Ll/۬ܿ۠;->᩹:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ܿ۠;)Ll/ۙܿ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܿ۠;->᩸:Ll/ۙܿ۠;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬ܿ۠;)Ll/᩷۠ᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܿ۠;->᩶:Ll/᩷۠ᩴ;

    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1083
    check-cast p1, Ll/۬ܿ۠;

    .line 1096
    iget v0, p0, Ll/۬ܿ۠;->᩹:I

    iget p1, p1, Ll/۬ܿ۠;->᩹:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1104
    instance-of v0, p1, Ll/۬ܿ۠;

    if-eqz v0, :cond_0

    .line 1101
    check-cast p1, Ll/۬ܿ۠;

    iget-object v0, p0, Ll/۬ܿ۠;->᩶:Ll/᩷۠ᩴ;

    iget-object v1, p1, Ll/۬ܿ۠;->᩶:Ll/᩷۠ᩴ;

    .line 1102
    invoke-interface {v0, v1}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ܿ۠;->᩸:Ll/ۙܿ۠;

    iget-object v1, p1, Ll/۬ܿ۠;->᩸:Ll/ۙܿ۠;

    .line 1103
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۬ܿ۠;->᩹:I

    iget p1, p1, Ll/۬ܿ۠;->᩹:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1109
    iget v0, p0, Ll/۬ܿ۠;->᩹:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/۬ܿ۠;->᩶:Ll/᩷۠ᩴ;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Ll/۬ܿ۠;->᩸:Ll/ۙܿ۠;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
