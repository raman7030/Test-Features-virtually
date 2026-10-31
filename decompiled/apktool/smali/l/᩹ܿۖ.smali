.class public final Ll/᩹ܿۖ;
.super Ll/۠ᩳۖ;
.source "8827"


# static fields
.field public static final ܽ:Ll/ܶᩳۖ;


# instance fields
.field public final ֫:Ljava/lang/Class;

.field public final ۧ:Ll/۠ᩳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ll/᩸ܿۖ;

    invoke-direct {v0}, Ll/᩸ܿۖ;-><init>()V

    sput-object v0, Ll/᩹ܿۖ;->ܽ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/Class;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 60
    new-instance v0, Ll/᩸ܳۖ;

    invoke-direct {v0, p1, p2, p3}, Ll/᩸ܳۖ;-><init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Ll/᩹ܿۖ;->ۧ:Ll/۠ᩳۖ;

    .line 62
    iput-object p3, p0, Ll/᩹ܿۖ;->֫:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 4

    .line 67
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 68
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 72
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 73
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 74
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 75
    iget-object v1, p0, Ll/᩹ܿۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v1, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 82
    iget-object v1, p0, Ll/᩹ܿۖ;->֫:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 83
    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_2

    .line 85
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v1

    .line 92
    :cond_3
    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 93
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 4

    if-nez p2, :cond_0

    .line 100
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 104
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->֫()V

    .line 105
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 107
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    .line 108
    iget-object v3, p0, Ll/᩹ܿۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v3, p1, v2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 110
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ᩳ()V

    return-void
.end method
