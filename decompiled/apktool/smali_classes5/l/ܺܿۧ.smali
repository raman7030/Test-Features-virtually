.class public Ll/ܺܿۧ;
.super Ljava/lang/Object;
.source "V7S4"

# interfaces
.implements Ll/ۢܿۧ;


# instance fields
.field public final ֫:Ll/ۢܿۧ;


# direct methods
.method public constructor <init>(Ll/ۢܿۧ;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 185
    :cond_0
    instance-of v0, p1, Ll/ܺܿۧ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 188
    :cond_1
    check-cast p1, Ll/ܺܿۧ;

    .line 189
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    iget-object p1, p1, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final indexOf(I)I
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1}, Ll/ᩴܿۧ;->indexOf(I)I

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ᩴܿۧ;->length()I

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(JLjava/util/List;)I
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢܿۧ;->֫(JLjava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ֫(F)V
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1}, Ll/ۢܿۧ;->֫(F)V

    return-void
.end method

.method public final ֫(JJJLjava/util/List;[Ll/ᩳᩳۧ;)V
    .locals 10

    move-object v0, p0

    .line 110
    iget-object v1, v0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-interface/range {v1 .. v9}, Ll/ۢܿۧ;->֫(JJJLjava/util/List;[Ll/ᩳᩳۧ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1}, Ll/ۢܿۧ;->֫(Z)V

    return-void
.end method

.method public final ֫(IJ)Z
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢܿۧ;->֫(IJ)Z

    move-result p1

    return p1
.end method

.method public final ֫(JLl/۟ܽۧ;Ljava/util/List;)Z
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1, p2, p3, p4}, Ll/ۢܿۧ;->֫(JLl/۟ܽۧ;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final ۡ()Ll/ۢܿۧ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    return-object v0
.end method

.method public final ۢ()V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->ۢ()V

    return-void
.end method

.method public final ۧ(I)I
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1}, Ll/ᩴܿۧ;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(IJ)Z
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۢܿۧ;->ۧ(IJ)Z

    move-result p1

    return p1
.end method

.method public final ܳ()V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->ܳ()V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->ܽ()V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->ᩳ()V

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->᩷()I

    move-result v0

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ܺܿۧ;->֫:Ll/ۢܿۧ;

    invoke-interface {v0}, Ll/ۢܿۧ;->᩻()I

    move-result v0

    return v0
.end method
