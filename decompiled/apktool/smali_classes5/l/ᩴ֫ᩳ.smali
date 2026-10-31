.class public final Ll/ᩴ֫ᩳ;
.super Ll/᩺֫ᩳ;
.source "B9R5"


# instance fields
.field public ܽ֫:I

.field public final synthetic ܿ֫:[Z

.field public final synthetic ᩳ֫:[Ll/ۚ֫ᩳ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;[Ll/ۚ֫ᩳ;[Z)V
    .locals 0

    .line 504
    iput-object p2, p0, Ll/ᩴ֫ᩳ;->ᩳ֫:[Ll/ۚ֫ᩳ;

    iput-object p3, p0, Ll/ᩴ֫ᩳ;->ܿ֫:[Z

    invoke-direct {p0, p1}, Ll/᩺֫ᩳ;-><init>(Ll/ۗܺ᩷;)V

    const/4 p1, 0x0

    .line 505
    iput p1, p0, Ll/ᩴ֫ᩳ;->ܽ֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 5

    .line 509
    iget v0, p0, Ll/ᩴ֫ᩳ;->ܽ֫:I

    iget-object v1, p0, Ll/ᩴ֫ᩳ;->ᩳ֫:[Ll/ۚ֫ᩳ;

    aget-object v0, v1, v0

    .line 510
    iget-object v2, v0, Ll/ۚ֫ᩳ;->֫:Ljava/lang/String;

    iget-object v3, v0, Ll/ۚ֫ᩳ;->֫:Ljava/lang/String;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    iget-object v2, v0, Ll/ۚ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    iget-object v2, p0, Ll/ᩴ֫ᩳ;->ܿ֫:[Z

    const/4 v4, 0x0

    aget-boolean v2, v2, v4

    if-nez v2, :cond_0

    .line 513
    iget-object v0, v0, Ll/ۚ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, v3, v0}, Ll/᩺֫ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 515
    :cond_0
    iget-object v0, v0, Ll/ۚ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, v0, v3}, Ll/᩺֫ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    :goto_0
    iget v0, p0, Ll/ᩴ֫ᩳ;->ܽ֫:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Ll/ᩴ֫ᩳ;->ܽ֫:I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    return v4
.end method
