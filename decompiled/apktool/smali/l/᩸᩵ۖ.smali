.class public final Ll/᩸᩵ۖ;
.super Ljava/lang/Object;
.source "I9QN"


# static fields
.field public static final ۧ:Ll/֨᩵ۖ;


# instance fields
.field public final ֫:Ll/ܶ᩵ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 134
    new-instance v0, Ll/֨᩵ۖ;

    .line 135
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 134
    sput-object v0, Ll/᩸᩵ۖ;->ۧ:Ll/֨᩵ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 101
    new-instance v0, Ll/ܶ᩵ۖ;

    .line 102
    invoke-static {}, Ll/ᩴᩴۖ;->֫()Ll/ᩴᩴۖ;

    move-result-object v1

    .line 149
    :try_start_0
    const-class v2, Ll/ᩴ᩷ۖ;

    sget v3, Ll/ᩴ᩷ۖ;->֫:I

    const-string v3, "getInstance"

    const/4 v4, 0x0

    .line 150
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷֡ۖ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 152
    :catch_0
    sget-object v2, Ll/᩸᩵ۖ;->ۧ:Ll/֨᩵ۖ;

    :goto_0
    const/4 v3, 0x2

    new-array v3, v3, [Ll/᩷֡ۖ;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    .line 102
    invoke-direct {v0, v3}, Ll/ܶ᩵ۖ;-><init>([Ll/᩷֡ۖ;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    sget-object v1, Ll/ܰᩴۖ;->֫:[B

    iput-object v0, p0, Ll/᩸᩵ۖ;->֫:Ll/ܶ᩵ۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۢۚۖ;
    .locals 7

    .line 31
    invoke-static {p1}, Ll/ۡۚۖ;->֫(Ljava/lang/Class;)V

    .line 33
    iget-object v0, p0, Ll/᩸᩵ۖ;->֫:Ll/ܶ᩵ۖ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ۖ;->֫(Ljava/lang/Class;)Ll/ۜ֡ۖ;

    move-result-object v1

    .line 36
    invoke-interface {v1}, Ll/ۜ֡ۖ;->֫()Z

    move-result v0

    const-class v2, Ll/᩸ᩴۖ;

    if-eqz v0, :cond_1

    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 39
    invoke-static {}, Ll/ۡۚۖ;->ۧ()Ll/ܺ֨ۖ;

    move-result-object p1

    .line 40
    invoke-static {}, Ll/ۢۘۖ;->ۧ()Ll/᩷ۘۖ;

    move-result-object v0

    .line 41
    invoke-interface {v1}, Ll/ۜ֡ۖ;->ۧ()Ll/ۡ֡ۖ;

    move-result-object v1

    .line 38
    invoke-static {p1, v0, v1}, Ll/᩸֡ۖ;->֫(Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۡ֡ۖ;)Ll/᩸֡ۖ;

    move-result-object p1

    return-object p1

    .line 44
    :cond_0
    invoke-static {}, Ll/ۡۚۖ;->֫()Ll/ܿ֨ۖ;

    move-result-object p1

    .line 45
    invoke-static {}, Ll/ۢۘۖ;->֫()Ll/ܿۘۖ;

    move-result-object v0

    .line 46
    invoke-interface {v1}, Ll/ۜ֡ۖ;->ۧ()Ll/ۡ֡ۖ;

    move-result-object v1

    .line 43
    invoke-static {p1, v0, v1}, Ll/᩸֡ۖ;->֫(Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۡ֡ۖ;)Ll/᩸֡ۖ;

    move-result-object p1

    return-object p1

    .line 53
    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 92
    sget-object p1, Ll/۠᩵ۖ;->֫:[I

    invoke-interface {v1}, Ll/ۜ֡ۖ;->ܽ()Ll/ۛ֡ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p1, p1, v2

    if-eq p1, v0, :cond_2

    .line 58
    invoke-static {}, Ll/ۗ֡ۖ;->ۧ()Ll/ۙ֡ۖ;

    move-result-object v2

    .line 59
    invoke-static {}, Ll/֡᩵ۖ;->ۧ()Ll/᩵᩵ۖ;

    move-result-object v3

    .line 60
    invoke-static {}, Ll/ۡۚۖ;->ۧ()Ll/ܺ֨ۖ;

    move-result-object v4

    .line 61
    invoke-static {}, Ll/ۢۘۖ;->ۧ()Ll/᩷ۘۖ;

    move-result-object v5

    .line 62
    invoke-static {}, Ll/ܿ֡ۖ;->ۧ()Ll/ᩳ֡ۖ;

    move-result-object v6

    .line 55
    invoke-static/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ll/ۜ֡ۖ;Ll/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)Ll/ܶ֡ۖ;

    move-result-object p1

    return-object p1

    .line 66
    :cond_2
    invoke-static {}, Ll/ۗ֡ۖ;->ۧ()Ll/ۙ֡ۖ;

    move-result-object v2

    .line 67
    invoke-static {}, Ll/֡᩵ۖ;->ۧ()Ll/᩵᩵ۖ;

    move-result-object v3

    .line 68
    invoke-static {}, Ll/ۡۚۖ;->ۧ()Ll/ܺ֨ۖ;

    move-result-object v4

    const/4 v5, 0x0

    .line 70
    invoke-static {}, Ll/ܿ֡ۖ;->ۧ()Ll/ᩳ֡ۖ;

    move-result-object v6

    .line 63
    invoke-static/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ll/ۜ֡ۖ;Ll/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)Ll/ܶ֡ۖ;

    move-result-object p1

    return-object p1

    .line 92
    :cond_3
    sget-object p1, Ll/۠᩵ۖ;->֫:[I

    invoke-interface {v1}, Ll/ۜ֡ۖ;->ܽ()Ll/ۛ֡ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p1, p1, v2

    if-eq p1, v0, :cond_4

    .line 76
    invoke-static {}, Ll/ۗ֡ۖ;->֫()Ll/᩹֡ۖ;

    move-result-object v2

    .line 77
    invoke-static {}, Ll/֡᩵ۖ;->֫()Ll/ᩴ᩵ۖ;

    move-result-object v3

    .line 78
    invoke-static {}, Ll/ۡۚۖ;->֫()Ll/ܿ֨ۖ;

    move-result-object v4

    .line 79
    invoke-static {}, Ll/ۢۘۖ;->֫()Ll/ܿۘۖ;

    move-result-object v5

    .line 80
    invoke-static {}, Ll/ܿ֡ۖ;->֫()Ll/ۧ֡ۖ;

    move-result-object v6

    .line 73
    invoke-static/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ll/ۜ֡ۖ;Ll/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)Ll/ܶ֡ۖ;

    move-result-object p1

    return-object p1

    .line 84
    :cond_4
    invoke-static {}, Ll/ۗ֡ۖ;->֫()Ll/᩹֡ۖ;

    move-result-object v2

    .line 85
    invoke-static {}, Ll/֡᩵ۖ;->֫()Ll/ᩴ᩵ۖ;

    move-result-object v3

    .line 86
    invoke-static {}, Ll/ۡۚۖ;->֫()Ll/ܿ֨ۖ;

    move-result-object v4

    const/4 v5, 0x0

    .line 88
    invoke-static {}, Ll/ܿ֡ۖ;->֫()Ll/ۧ֡ۖ;

    move-result-object v6

    .line 81
    invoke-static/range {v1 .. v6}, Ll/ܶ֡ۖ;->֫(Ll/ۜ֡ۖ;Ll/᩹֡ۖ;Ll/֡᩵ۖ;Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۧ֡ۖ;)Ll/ܶ֡ۖ;

    move-result-object p1

    return-object p1
.end method
