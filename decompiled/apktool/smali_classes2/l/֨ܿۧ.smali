.class public final Ll/֨ܿۧ;
.super Ljava/lang/Object;
.source "N8Q4"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public final ۧ:I

.field public final ܽ:[Ll/ܿ۬֫;

.field public final ܿ:Ll/ܰ᩵֫;

.field public final ᩳ:[Ll/ۢܿۧ;


# direct methods
.method public constructor <init>([Ll/ܿ۬֫;[Ll/ۢܿۧ;Ll/ܰ᩵֫;Ljava/lang/Object;)V
    .locals 2

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 90
    iput-object p1, p0, Ll/֨ܿۧ;->ܽ:[Ll/ܿ۬֫;

    .line 91
    invoke-virtual {p2}, [Ll/ۢܿۧ;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/ۢܿۧ;

    iput-object p2, p0, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    .line 92
    iput-object p3, p0, Ll/֨ܿۧ;->ܿ:Ll/ܰ᩵֫;

    .line 93
    iput-object p4, p0, Ll/֨ܿۧ;->֫:Ljava/lang/Object;

    .line 94
    array-length p1, p1

    iput p1, p0, Ll/֨ܿۧ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 99
    iget-object v0, p0, Ll/֨ܿۧ;->ܽ:[Ll/ܿ۬֫;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/֨ܿۧ;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 136
    :cond_0
    iget-object v1, p0, Ll/֨ܿۧ;->ܽ:[Ll/ܿ۬֫;

    aget-object v1, v1, p2

    iget-object v2, p1, Ll/֨ܿۧ;->ܽ:[Ll/ܿ۬֫;

    aget-object v2, v2, p2

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    aget-object v1, v1, p2

    iget-object p1, p1, Ll/֨ܿۧ;->ᩳ:[Ll/ۢܿۧ;

    aget-object p1, p1, p2

    .line 137
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
