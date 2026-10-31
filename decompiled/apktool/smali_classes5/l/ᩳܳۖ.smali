.class public final Ll/ᩳܳۖ;
.super Ljava/lang/Object;
.source "Q886"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final ᩸:Ll/᩶ᩳۖ;


# direct methods
.method public constructor <init>(Ll/᩶ᩳۖ;)V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, Ll/ᩳܳۖ;->᩸:Ll/᩶ᩳۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 5

    .line 127
    invoke-virtual {p2}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 129
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v1

    .line 130
    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 134
    :cond_0
    invoke-static {v1, v0}, Ll/ۛᩳۖ;->ۧ(Ljava/lang/Class;Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    .line 135
    aget-object v2, v0, v1

    const/4 v3, 0x1

    .line 136
    aget-object v0, v0, v3

    .line 156
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_2

    const-class v3, Ljava/lang/Boolean;

    if-ne v2, v3, :cond_1

    goto :goto_0

    .line 158
    :cond_1
    invoke-static {v2}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v3

    goto :goto_1

    .line 157
    :cond_2
    :goto_0
    sget-object v3, Ll/᩸᩻ۖ;->᩻:Ll/۠ᩳۖ;

    .line 138
    :goto_1
    new-instance v4, Ll/᩸ܳۖ;

    invoke-direct {v4, p1, v3, v2}, Ll/᩸ܳۖ;-><init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/reflect/Type;)V

    .line 140
    invoke-static {v0}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v2

    .line 141
    new-instance v3, Ll/᩸ܳۖ;

    invoke-direct {v3, p1, v2, v0}, Ll/᩸ܳۖ;-><init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/reflect/Type;)V

    .line 146
    iget-object p1, p0, Ll/ᩳܳۖ;->᩸:Ll/᩶ᩳۖ;

    invoke-virtual {p1, p2, v1}, Ll/᩶ᩳۖ;->֫(Ll/ܽۜۖ;Z)Ll/᩷ܿۖ;

    move-result-object p1

    .line 150
    new-instance p2, Ll/ܽܳۖ;

    invoke-direct {p2, p0, v4, v3, p1}, Ll/ܽܳۖ;-><init>(Ll/ᩳܳۖ;Ll/۠ᩳۖ;Ll/۠ᩳۖ;Ll/᩷ܿۖ;)V

    return-object p2
.end method
