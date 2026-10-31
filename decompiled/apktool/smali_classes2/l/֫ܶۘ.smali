.class public final Ll/֫ܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public final synthetic ֫:I

.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/֫ܶۘ;->֫:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/֫ܶۘ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/֫ܶۘ;->֫:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/֫ܶۘ;->ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/֫ܶۘ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 147
    :pswitch_0
    iget-object v0, p0, Ll/֫ܶۘ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(I)V
    .locals 3

    if-ltz p1, :cond_1

    const/4 v0, 0x6

    if-le p1, v0, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Ll/֫ܶۘ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public ֫()Z
    .locals 2

    .line 27
    iget-object v0, p0, Ll/֫ܶۘ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
