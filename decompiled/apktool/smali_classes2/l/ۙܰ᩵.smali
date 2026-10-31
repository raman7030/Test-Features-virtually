.class public final Ll/ۙܰ᩵;
.super Ljava/lang/Object;
.source "C30H"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙܰ᩵;->֫:Ljava/util/ArrayList;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙܰ᩵;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۗܰ᩵;
    .locals 3

    .line 137
    new-instance v0, Ll/ۗܰ᩵;

    iget-object v1, p0, Ll/ۙܰ᩵;->֫:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۙܰ᩵;->ۧ:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Ll/ۗܰ᩵;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    .line 1752
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const-string v3, " \"\':;<=>@[]^`{}|/\\?#&!$(),~"

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v11, 0x1

    move-object v0, p1

    move v5, v9

    move v7, v11

    .line 1751
    invoke-static/range {v0 .. v7}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p1

    .line 122
    iget-object v0, p0, Ll/ۙܰ᩵;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    .line 1752
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v7

    const-string v8, " \"\':;<=>@[]^`{}|/\\?#&!$(),~"

    const/4 v10, 0x0

    const/4 v12, 0x1

    move-object v5, p2

    .line 1751
    invoke-static/range {v5 .. v12}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;

    move-result-object p1

    .line 123
    iget-object p2, p0, Ll/ۙܰ᩵;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 119
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
