.class public final synthetic Ll/ۜܽۜ;
.super Ljava/lang/Object;
.source "G7AI"

# interfaces
.implements Ll/ۤܽۜ;


# instance fields
.field public final synthetic ֫:Ll/ۨܽۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܽۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܽۜ;->֫:Ll/ۨܽۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܽۜ;)Z
    .locals 4

    .line 1204
    iget-object v0, p0, Ll/ۜܽۜ;->֫:Ll/ۨܽۜ;

    iget-object v1, v0, Ll/ۨܽۜ;->֫:Ljava/util/ArrayList;

    iget v2, v0, Ll/ۨܽۜ;->ܿ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Ll/ۨܽۜ;->ܿ:I

    .line 1205
    iget-object v2, v0, Ll/ۨܽۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/۬ܽۜ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 1208
    :cond_0
    iget v2, v0, Ll/ۨܽۜ;->ܳ:I

    iget v3, v0, Ll/ۨܽۜ;->ܽ:I

    if-lt v2, v3, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, v0, Ll/ۨܽۜ;->ۧ:I

    if-ge v2, v3, :cond_1

    .line 1209
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1211
    :cond_1
    iget p1, v0, Ll/ۨܽۜ;->ܳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Ll/ۨܽۜ;->ܳ:I

    :goto_0
    const/4 p1, 0x0

    return p1
.end method
