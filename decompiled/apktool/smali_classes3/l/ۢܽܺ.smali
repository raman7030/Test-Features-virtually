.class public final Ll/ۢܽܺ;
.super Ljava/lang/Object;
.source "GBH1"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/۫ܺܺ;

.field public final ܽ:Ll/۬ܺܺ;

.field public final ᩳ:Ll/۫ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;Ll/۫ܺܺ;Ll/۬ܺܺ;I)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 103
    iput-object p1, p0, Ll/ۢܽܺ;->ۧ:Ll/۫ܺܺ;

    .line 104
    iput-object p2, p0, Ll/ۢܽܺ;->ᩳ:Ll/۫ܺܺ;

    .line 105
    iput-object p3, p0, Ll/ۢܽܺ;->ܽ:Ll/۬ܺܺ;

    .line 106
    iput p4, p0, Ll/ۢܽܺ;->֫:I

    return-void

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "innerClass == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 142
    iget v0, p0, Ll/ۢܽܺ;->֫:I

    return v0
.end method

.method public final ۧ()Ll/۫ܺܺ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۢܽܺ;->ۧ:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final ܽ()Ll/۬ܺܺ;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ۢܽܺ;->ܽ:Ll/۬ܺܺ;

    return-object v0
.end method

.method public final ᩳ()Ll/۫ܺܺ;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۢܽܺ;->ᩳ:Ll/۫ܺܺ;

    return-object v0
.end method
