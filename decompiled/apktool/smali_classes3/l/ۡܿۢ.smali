.class public final synthetic Ll/ۡܿۢ;
.super Ljava/lang/Object;
.source "SBMC"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ll/᩶ܿۢ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܿۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡܿۢ;->᩸:Ll/᩶ܿۢ;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۡܿۢ;->᩸:Ll/᩶ܿۢ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    instance-of v0, p1, Ll/ۡۧۢ;

    if-eqz v0, :cond_0

    .line 180
    move-object v1, p1

    check-cast v1, Ll/ۡۧۢ;

    invoke-virtual {v1}, Ll/ۡۧۢ;->ܽ()I

    move-result v1

    goto :goto_0

    .line 182
    :cond_0
    instance-of v1, p1, Ll/ܳۧۢ;

    if-eqz v1, :cond_1

    .line 183
    move-object v1, p1

    check-cast v1, Ll/ܳۧۢ;

    invoke-virtual {v1}, Ll/ܳۧۢ;->ܿ()I

    move-result v1

    goto :goto_0

    .line 185
    :cond_1
    move-object v1, p1

    check-cast v1, Ll/᩻ۧۢ;

    invoke-virtual {v1}, Ll/᩻ۧۢ;->᩻()I

    move-result v1

    .line 179
    :goto_0
    instance-of v2, p2, Ll/ۡۧۢ;

    if-eqz v2, :cond_2

    .line 180
    move-object v3, p2

    check-cast v3, Ll/ۡۧۢ;

    invoke-virtual {v3}, Ll/ۡۧۢ;->ܽ()I

    move-result v3

    goto :goto_1

    .line 182
    :cond_2
    instance-of v3, p2, Ll/ܳۧۢ;

    if-eqz v3, :cond_3

    .line 183
    move-object v3, p2

    check-cast v3, Ll/ܳۧۢ;

    invoke-virtual {v3}, Ll/ܳۧۢ;->ܿ()I

    move-result v3

    goto :goto_1

    .line 185
    :cond_3
    move-object v3, p2

    check-cast v3, Ll/᩻ۧۢ;

    invoke-virtual {v3}, Ll/᩻ۧۢ;->᩻()I

    move-result v3

    .line 149
    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-eqz v1, :cond_4

    return v1

    :cond_4
    const/4 v1, 0x2

    if-eqz v0, :cond_5

    const/4 v3, 0x0

    goto :goto_2

    .line 169
    :cond_5
    instance-of v3, p1, Ll/ܳۧۢ;

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v3, 0x2

    :goto_2
    if-eqz v2, :cond_7

    const/4 v1, 0x0

    goto :goto_3

    :cond_7
    instance-of v4, p2, Ll/ܳۧۢ;

    if-eqz v4, :cond_8

    const/4 v1, 0x1

    .line 153
    :cond_8
    :goto_3
    invoke-static {v3, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-eqz v1, :cond_9

    return v1

    :cond_9
    if-eqz v2, :cond_a

    .line 193
    check-cast p2, Ll/ۡۧۢ;

    invoke-virtual {p2}, Ll/ۡۧۢ;->֫()I

    move-result p2

    goto :goto_4

    .line 195
    :cond_a
    instance-of v1, p2, Ll/ܳۧۢ;

    if-eqz v1, :cond_b

    .line 196
    check-cast p2, Ll/ܳۧۢ;

    invoke-virtual {p2}, Ll/ܳۧۢ;->ۧ()I

    move-result p2

    goto :goto_4

    .line 198
    :cond_b
    check-cast p2, Ll/᩻ۧۢ;

    invoke-virtual {p2}, Ll/᩻ۧۢ;->ܽ()I

    move-result p2

    :goto_4
    if-eqz v0, :cond_c

    .line 193
    check-cast p1, Ll/ۡۧۢ;

    invoke-virtual {p1}, Ll/ۡۧۢ;->֫()I

    move-result p1

    goto :goto_5

    .line 195
    :cond_c
    instance-of v0, p1, Ll/ܳۧۢ;

    if-eqz v0, :cond_d

    .line 196
    check-cast p1, Ll/ܳۧۢ;

    invoke-virtual {p1}, Ll/ܳۧۢ;->ۧ()I

    move-result p1

    goto :goto_5

    .line 198
    :cond_d
    check-cast p1, Ll/᩻ۧۢ;

    invoke-virtual {p1}, Ll/᩻ۧۢ;->ܽ()I

    move-result p1

    .line 157
    :goto_5
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
