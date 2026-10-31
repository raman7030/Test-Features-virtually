.class public final synthetic Ll/֨ܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final synthetic ֫:Ll/᩻ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܿܿ;->֫:Ll/᩻ܳܿ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    sget v0, Ll/֡ܳܿ;->֨ۧ:I

    const/4 v0, 0x1

    .line 249
    iget-object v1, p0, Ll/֨ܿܿ;->֫:Ll/᩻ܳܿ;

    invoke-virtual {v1, v0}, Ll/᩻ܳܿ;->֫(Z)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
