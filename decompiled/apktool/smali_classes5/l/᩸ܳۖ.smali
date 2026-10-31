.class public final Ll/᩸ܳۖ;
.super Ll/۠ᩳۖ;
.source "K84H"


# instance fields
.field public final ֫:Ll/۫ܽۖ;

.field public final ۧ:Ll/۠ᩳۖ;

.field public final ܽ:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 33
    iput-object p1, p0, Ll/᩸ܳۖ;->֫:Ll/۫ܽۖ;

    .line 34
    iput-object p2, p0, Ll/᩸ܳۖ;->ۧ:Ll/۠ᩳۖ;

    .line 35
    iput-object p3, p0, Ll/᩸ܳۖ;->ܽ:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩸ܳۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 4

    .line 98
    iget-object v0, p0, Ll/᩸ܳۖ;->ܽ:Ljava/lang/reflect/Type;

    if-eqz p2, :cond_1

    instance-of v1, v0, Ljava/lang/Class;

    if-nez v1, :cond_0

    instance-of v1, v0, Ljava/lang/reflect/TypeVariable;

    if-eqz v1, :cond_1

    .line 99
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    .line 54
    :goto_0
    iget-object v2, p0, Ll/᩸ܳۖ;->ۧ:Ll/۠ᩳۖ;

    if-eq v1, v0, :cond_6

    .line 56
    iget-object v0, p0, Ll/᩸ܳۖ;->֫:Ll/۫ܽۖ;

    .line 57
    invoke-static {v1}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    .line 61
    instance-of v1, v0, Ll/ۖܳۖ;

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    move-object v1, v2

    .line 83
    :goto_1
    instance-of v3, v1, Ll/֨ܳۖ;

    if-eqz v3, :cond_4

    .line 84
    move-object v3, v1

    check-cast v3, Ll/֨ܳۖ;

    .line 85
    invoke-virtual {v3}, Ll/֨ܳۖ;->ۧ()Ll/۠ᩳۖ;

    move-result-object v3

    if-ne v3, v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v3

    goto :goto_1

    .line 93
    :cond_4
    :goto_2
    instance-of v1, v1, Ll/ۖܳۖ;

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v2, v0

    .line 73
    :cond_6
    :goto_4
    invoke-virtual {v2, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
