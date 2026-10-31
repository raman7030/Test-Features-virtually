.class public final Ll/ܽۛܺ;
.super Ll/ܳ۬ܺ;
.source "G552"


# static fields
.field public static final ۬:Ll/ܳ۬ܺ;


# instance fields
.field public final transient ۗ:I

.field public final transient ۙ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 37
    new-instance v0, Ll/ܽۛܺ;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Ll/ܽۛܺ;-><init>(I[Ljava/lang/Object;)V

    sput-object v0, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ll/ܳ۬ܺ;-><init>()V

    .line 44
    iput-object p2, p0, Ll/ܽۛܺ;->ۙ:[Ljava/lang/Object;

    .line 45
    iput p1, p0, Ll/ܽۛܺ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 83
    iget v0, p0, Ll/ܽۛܺ;->ۗ:I

    invoke-static {p1, v0}, Ll/ۘܶܺ;->֫(II)V

    .line 85
    iget-object v0, p0, Ll/ܽۛܺ;->ۙ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ܽۛܺ;->ۗ:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 96
    invoke-super {p0}, Ll/ܳ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 3

    .line 75
    iget-object v0, p0, Ll/ܽۛܺ;->ۙ:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Ll/ܽۛܺ;->ۗ:I

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v2

    return p1
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()[Ljava/lang/Object;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܽۛܺ;->ۙ:[Ljava/lang/Object;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 70
    iget v0, p0, Ll/ܽۛܺ;->ۗ:I

    return v0
.end method
