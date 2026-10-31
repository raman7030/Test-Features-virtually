.class public final synthetic Ll/᩹֫֨;
.super Ljava/lang/Object;
.source "T7EH"

# interfaces
.implements Ll/ۛ֫֨;


# instance fields
.field public final synthetic ֫:Ll/ۨ֫֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֫֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹֫֨;->֫:Ll/ۨ֫֨;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 61
    iget-object v0, p0, Ll/᩹֫֨;->֫:Ll/ۨ֫֨;

    iget-object v1, v0, Ll/ۨ֫֨;->۬֫:Ljava/util/function/Supplier;

    invoke-interface {v1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method
