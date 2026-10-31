.class public final synthetic Ll/ۢܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۢܿܿ;->֫:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    sget v0, Ll/֡ܳܿ;->֨ۧ:I

    .line 346
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/ۢܿܿ;->֫:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܳܿ;

    invoke-virtual {v0}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
