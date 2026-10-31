.class public final Ll/ۡۨ֫;
.super Ljava/lang/Object;
.source "F7LT"

# interfaces
.implements Ll/ۙۨ֫;


# static fields
.field public static final ܳ:Ll/᩻ۢۧ;


# instance fields
.field public final ֫:Ll/֨᩷ۧ;

.field public final ۧ:Ll/۠ᩴ֫;

.field public final ܽ:Z

.field public final ܿ:Ll/ۢ֨֫;

.field public final ᩳ:Ll/ۜᩴۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ll/᩻ۢۧ;

    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    sput-object v0, Ll/ۡۨ֫;->ܳ:Ll/᩻ۢۧ;

    return-void
.end method

.method public constructor <init>(Ll/֨᩷ۧ;Ll/۠ᩴ֫;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    .line 89
    iput-object p2, p0, Ll/ۡۨ֫;->ۧ:Ll/۠ᩴ֫;

    .line 90
    iput-object p3, p0, Ll/ۡۨ֫;->ܿ:Ll/ۢ֨֫;

    .line 91
    iput-object p4, p0, Ll/ۡۨ֫;->ᩳ:Ll/ۜᩴۧ;

    .line 92
    iput-boolean p5, p0, Ll/ۡۨ֫;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۡۨ֫;
    .locals 8

    .line 116
    iget-object v0, p0, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    invoke-interface {v0}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v1

    .line 117
    instance-of v2, v1, Ll/ܺۚۧ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    instance-of v1, v1, Ll/۬ۖۧ;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    xor-int/2addr v1, v3

    .line 123
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 125
    invoke-interface {v0}, Ll/֨᩷ۧ;->ܽ()Ll/֨᩷ۧ;

    move-result-object v1

    if-ne v1, v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t recreate wrapped extractors. Outer type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 124
    invoke-static {v1, v3}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    .line 129
    instance-of v1, v0, Ll/ۢ᩺֫;

    if-eqz v1, :cond_3

    .line 130
    new-instance v0, Ll/ۢ᩺֫;

    iget-object v1, p0, Ll/ۡۨ֫;->ۧ:Ll/۠ᩴ֫;

    iget-object v1, v1, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۡۨ֫;->ᩳ:Ll/ۜᩴۧ;

    iget-boolean v3, p0, Ll/ۡۨ֫;->ܽ:Z

    iget-object v4, p0, Ll/ۡۨ֫;->ܿ:Ll/ۢ֨֫;

    invoke-direct {v0, v1, v4, v2, v3}, Ll/ۢ᩺֫;-><init>(Ljava/lang/String;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V

    :goto_3
    move-object v3, v0

    goto :goto_4

    .line 136
    :cond_3
    instance-of v1, v0, Ll/᩻֡ۧ;

    if-eqz v1, :cond_4

    .line 137
    new-instance v0, Ll/᩻֡ۧ;

    .line 124
    invoke-direct {v0, v4}, Ll/᩻֡ۧ;-><init>(I)V

    goto :goto_3

    .line 138
    :cond_4
    instance-of v1, v0, Ll/ܽ֡ۧ;

    if-eqz v1, :cond_5

    .line 139
    new-instance v0, Ll/ܽ֡ۧ;

    invoke-direct {v0}, Ll/ܽ֡ۧ;-><init>()V

    goto :goto_3

    .line 140
    :cond_5
    instance-of v1, v0, Ll/ܿ֡ۧ;

    if-eqz v1, :cond_6

    .line 141
    new-instance v0, Ll/ܿ֡ۧ;

    invoke-direct {v0}, Ll/ܿ֡ۧ;-><init>()V

    goto :goto_3

    .line 142
    :cond_6
    instance-of v1, v0, Ll/ܿۖۧ;

    if-eqz v1, :cond_7

    .line 143
    new-instance v0, Ll/ܿۖۧ;

    const/4 v1, 0x0

    .line 190
    invoke-direct {v0, v1}, Ll/ܿۖۧ;-><init>(I)V

    goto :goto_3

    .line 149
    :goto_4
    new-instance v0, Ll/ۡۨ֫;

    iget-object v6, p0, Ll/ۡۨ֫;->ᩳ:Ll/ۜᩴۧ;

    iget-boolean v7, p0, Ll/ۡۨ֫;->ܽ:Z

    iget-object v4, p0, Ll/ۡۨ֫;->ۧ:Ll/۠ᩴ֫;

    iget-object v5, p0, Ll/ۡۨ֫;->ܿ:Ll/ۢ֨֫;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Ll/ۡۨ֫;-><init>(Ll/֨᩷ۧ;Ll/۠ᩴ֫;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V

    return-object v0

    .line 145
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Unexpected extractor type for recreation: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/ܺ᩷ۧ;)Z
    .locals 2

    .line 102
    iget-object v0, p0, Ll/ۡۨ֫;->֫:Ll/֨᩷ۧ;

    sget-object v1, Ll/ۡۨ֫;->ܳ:Ll/᩻ۢۧ;

    invoke-interface {v0, p1, v1}, Ll/֨᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
