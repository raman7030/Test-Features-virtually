.class public final Ll/ܽۙۧ;
.super Ljava/lang/Object;
.source "I5WF"


# instance fields
.field public final ֫:[I

.field public final ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1037
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1038
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܽۙۧ;->֫:[I

    .line 1039
    array-length p1, p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ܽۙۧ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 1043
    iget v0, p0, Ll/ܽۙۧ;->ۧ:I

    add-int/2addr p1, v0

    iget-object v0, p0, Ll/ܽۙۧ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)V
    .locals 1

    .line 1051
    iget v0, p0, Ll/ܽۙۧ;->ۧ:I

    add-int/2addr p1, v0

    iget-object v0, p0, Ll/ܽۙۧ;->֫:[I

    aput p2, v0, p1

    return-void
.end method

.method public final ֫()[I
    .locals 1

    .line 1047
    iget-object v0, p0, Ll/ܽۙۧ;->֫:[I

    return-object v0
.end method
