.class public final Ll/ᩳ᩺ۡ;
.super Ljava/lang/Object;
.source "UAO5"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 68
    iput v0, p0, Ll/ᩳ᩺ۡ;->᩹:I

    .line 71
    iput-object p1, p0, Ll/ᩳ᩺ۡ;->᩶:Ljava/lang/String;

    .line 72
    iput p2, p0, Ll/ᩳ᩺ۡ;->᩸:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩺ۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩳ᩺ۡ;->᩸:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩺ۡ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳ᩺ۡ;->᩹:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩳ᩺ۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩺ۡ;->᩶:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 65
    check-cast p1, Ll/ᩳ᩺ۡ;

    .line 77
    iget v0, p0, Ll/ᩳ᩺ۡ;->᩸:I

    iget v1, p1, Ll/ᩳ᩺ۡ;->᩸:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 81
    :cond_0
    iget-object v0, p0, Ll/ᩳ᩺ۡ;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩳ᩺ۡ;->᩶:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 2

    .line 85
    iget v0, p0, Ll/ᩳ᩺ۡ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 86
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
