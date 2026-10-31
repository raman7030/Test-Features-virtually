.class public final Ll/ܰܿۖ;
.super Ljava/lang/Object;
.source "R85J"

# interfaces
.implements Ll/ܶᩳۖ;


# static fields
.field public static final ۙ:Ll/ܶᩳۖ;

.field public static final ᩶:Ll/ܶᩳۖ;


# instance fields
.field public final ᩸:Ll/ۧۤᩴ;

.field public final ᩹:Ll/᩶ᩳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 46
    new-instance v0, Ll/᩺ܿۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩺ܿۖ;-><init>(I)V

    sput-object v0, Ll/ܰܿۖ;->᩶:Ll/ܶᩳۖ;

    .line 50
    new-instance v0, Ll/᩺ܿۖ;

    invoke-direct {v0, v1}, Ll/᩺ܿۖ;-><init>(I)V

    sput-object v0, Ll/ܰܿۖ;->ۙ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ᩳۖ;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/ܰܿۖ;->᩹:Ll/᩶ᩳۖ;

    .line 66
    new-instance p1, Ll/ۧۤᩴ;

    invoke-direct {p1}, Ll/ۧۤᩴ;-><init>()V

    iput-object p1, p0, Ll/ܰܿۖ;->᩸:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 7

    .line 78
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v0

    .line 71
    const-class v1, Ll/᩸ᩳۖ;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/᩸ᩳۖ;

    if-nez v5, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 83
    :cond_0
    iget-object v2, p0, Ll/ܰܿۖ;->᩹:Ll/᩶ᩳۖ;

    const/4 v6, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    .line 84
    invoke-virtual/range {v1 .. v6}, Ll/ܰܿۖ;->֫(Ll/᩶ᩳۖ;Ll/۫ܽۖ;Ll/ܽۜۖ;Ll/᩸ᩳۖ;Z)Ll/۠ᩳۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ᩳۖ;Ll/۫ܽۖ;Ll/ܽۜۖ;Ll/᩸ᩳۖ;Z)Ll/۠ᩳۖ;
    .locals 7

    .line 111
    invoke-interface {p4}, Ll/᩸ᩳۖ;->value()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    .line 96
    invoke-static {v0}, Ll/ܽۜۖ;->֫(Ljava/lang/Class;)Ll/ܽۜۖ;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Ll/᩶ᩳۖ;->֫(Ll/ܽۜۖ;Z)Ll/᩷ܿۖ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷ܿۖ;->ۧ()Ljava/lang/Object;

    move-result-object p1

    .line 114
    invoke-interface {p4}, Ll/᩸ᩳۖ;->nullSafe()Z

    move-result v6

    .line 115
    instance-of p4, p1, Ll/۠ᩳۖ;

    if-eqz p4, :cond_0

    .line 116
    check-cast p1, Ll/۠ᩳۖ;

    goto/16 :goto_4

    .line 117
    :cond_0
    instance-of p4, p1, Ll/ܶᩳۖ;

    if-eqz p4, :cond_2

    .line 118
    check-cast p1, Ll/ܶᩳۖ;

    if-eqz p5, :cond_1

    .line 121
    invoke-virtual {p3}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p4

    .line 101
    iget-object p5, p0, Ll/ܰܿۖ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {p5, p4, p1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ܶᩳۖ;

    if-eqz p4, :cond_1

    move-object p1, p4

    .line 124
    :cond_1
    invoke-interface {p1, p2, p3}, Ll/ܶᩳۖ;->֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object p1

    goto :goto_4

    .line 125
    :cond_2
    instance-of p4, p1, Ll/ܿᩳۖ;

    if-nez p4, :cond_4

    instance-of v0, p1, Ll/ۨܽۖ;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 148
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Invalid attempt to bind an instance of "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    invoke-virtual {p3}, Ll/ܽۜۖ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_0
    const/4 v0, 0x0

    if-eqz p4, :cond_5

    .line 127
    move-object p4, p1

    check-cast p4, Ll/ܿᩳۖ;

    move-object v1, p4

    goto :goto_1

    :cond_5
    move-object v1, v0

    .line 129
    :goto_1
    instance-of p4, p1, Ll/ۨܽۖ;

    if-eqz p4, :cond_6

    check-cast p1, Ll/ۨܽۖ;

    move-object v2, p1

    goto :goto_2

    :cond_6
    move-object v2, v0

    :goto_2
    if-eqz p5, :cond_7

    .line 136
    sget-object p1, Ll/ܰܿۖ;->᩶:Ll/ܶᩳۖ;

    goto :goto_3

    .line 138
    :cond_7
    sget-object p1, Ll/ܰܿۖ;->ۙ:Ll/ܶᩳۖ;

    :goto_3
    move-object v5, p1

    .line 141
    new-instance p1, Ll/ܶܳۖ;

    move-object v0, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Ll/ܶܳۖ;-><init>(Ll/ܿᩳۖ;Ll/ۨܽۖ;Ll/۫ܽۖ;Ll/ܽۜۖ;Ll/ܶᩳۖ;Z)V

    const/4 v6, 0x0

    :goto_4
    if-eqz p1, :cond_8

    if-eqz v6, :cond_8

    .line 158
    invoke-virtual {p1}, Ll/۠ᩳۖ;->֫()Ll/۠ᩳۖ;

    move-result-object p1

    :cond_8
    return-object p1
.end method

.method public final ֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Z
    .locals 4

    .line 169
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    sget-object v0, Ll/ܰܿۖ;->᩶:Ll/ܶᩳۖ;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p2

    .line 179
    iget-object v0, p0, Ll/ܰܿۖ;->᩸:Ll/ۧۤᩴ;

    invoke-virtual {v0, p2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶᩳۖ;

    if-eqz v2, :cond_1

    if-ne v2, p1, :cond_5

    goto :goto_0

    .line 71
    :cond_1
    const-class v2, Ll/᩸ᩳۖ;

    invoke-virtual {p2, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Ll/᩸ᩳۖ;

    if-nez v2, :cond_2

    goto :goto_1

    .line 194
    :cond_2
    invoke-interface {v2}, Ll/᩸ᩳۖ;->value()Ljava/lang/Class;

    move-result-object v2

    .line 195
    const-class v3, Ll/ܶᩳۖ;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 199
    :cond_3
    iget-object v3, p0, Ll/ܰܿۖ;->᩹:Ll/᩶ᩳۖ;

    .line 96
    invoke-static {v2}, Ll/ܽۜۖ;->֫(Ljava/lang/Class;)Ll/ܽۜۖ;

    move-result-object v2

    invoke-virtual {v3, v2, v1}, Ll/᩶ᩳۖ;->֫(Ll/ܽۜۖ;Z)Ll/᩷ܿۖ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷ܿۖ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    .line 200
    check-cast v2, Ll/ܶᩳۖ;

    .line 101
    invoke-virtual {v0, p2, v2}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶᩳۖ;

    if-eqz p2, :cond_4

    move-object v2, p2

    :cond_4
    if-ne v2, p1, :cond_5

    :goto_0
    return v1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
