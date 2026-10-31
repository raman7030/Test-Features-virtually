.class public final Ll/ᩳᩴ֫;
.super Ljava/lang/Object;
.source "L8MG"


# static fields
.field public static final ۧ:Ll/ᩳᩴ֫;


# instance fields
.field public ֫:Ll/ܽᩴ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 140
    new-instance v0, Ll/ᩳᩴ֫;

    .line 176
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 68
    sput-object v0, Ll/ᩳᩴ֫;->ۧ:Ll/ᩳᩴ֫;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/4 v0, 0x5

    .line 269
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_2

    .line 240
    const-class v1, Ll/ᩳᩴ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 243
    :cond_1
    check-cast p1, Ll/ᩳᩴ֫;

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x7cb5988f

    return v0
.end method

.method public final ֫()Ll/ܽᩴ֫;
    .locals 1

    .line 192
    iget-object v0, p0, Ll/ᩳᩴ֫;->֫:Ll/ܽᩴ֫;

    if-nez v0, :cond_0

    .line 193
    new-instance v0, Ll/ܽᩴ֫;

    invoke-direct {v0, p0}, Ll/ܽᩴ֫;-><init>(Ll/ᩳᩴ֫;)V

    iput-object v0, p0, Ll/ᩳᩴ֫;->֫:Ll/ܽᩴ֫;

    .line 195
    :cond_0
    iget-object v0, p0, Ll/ᩳᩴ֫;->֫:Ll/ܽᩴ֫;

    return-object v0
.end method
