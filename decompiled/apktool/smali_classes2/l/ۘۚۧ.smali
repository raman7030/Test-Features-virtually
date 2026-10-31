.class public final Ll/ۘۚۧ;
.super Ljava/lang/Object;
.source "38SD"


# instance fields
.field public final ֫:I

.field public final ۧ:[B

.field public final ܽ:Ljava/util/List;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p2, p0, Ll/ۘۚۧ;->ᩳ:Ljava/lang/String;

    .line 131
    iput p3, p0, Ll/ۘۚۧ;->֫:I

    if-nez p4, :cond_0

    .line 134
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 135
    :cond_0
    invoke-static {p4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۘۚۧ;->ܽ:Ljava/util/List;

    .line 136
    iput-object p5, p0, Ll/ۘۚۧ;->ۧ:[B

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/4 v0, 0x2

    .line 99
    iget v1, p0, Ll/ۘۚۧ;->֫:I

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v0, 0x200

    return v0

    :cond_1
    const/16 v0, 0x800

    return v0
.end method
