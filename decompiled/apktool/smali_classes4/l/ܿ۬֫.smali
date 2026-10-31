.class public final Ll/ܿ۬֫;
.super Ljava/lang/Object;
.source "H8UA"


# static fields
.field public static final ܽ:Ll/ܿ۬֫;


# instance fields
.field public final ֫:I

.field public final ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Ll/ܿ۬֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ܿ۬֫;-><init>(IZ)V

    sput-object v0, Ll/ܿ۬֫;->ܽ:Ll/ܿ۬֫;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput p1, p0, Ll/ܿ۬֫;->֫:I

    .line 58
    iput-boolean p2, p0, Ll/ܿ۬֫;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 66
    const-class v0, Ll/ܿ۬֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 69
    :cond_1
    check-cast p1, Ll/ܿ۬֫;

    .line 70
    iget v0, p0, Ll/ܿ۬֫;->֫:I

    iget v1, p1, Ll/ܿ۬֫;->֫:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ܿ۬֫;->ۧ:Z

    iget-boolean p1, p1, Ll/ܿ۬֫;->ۧ:Z

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 75
    iget v0, p0, Ll/ܿ۬֫;->֫:I

    shl-int/lit8 v0, v0, 0x1

    .line 76
    iget-boolean v1, p0, Ll/ܿ۬֫;->ۧ:Z

    add-int/2addr v0, v1

    return v0
.end method
