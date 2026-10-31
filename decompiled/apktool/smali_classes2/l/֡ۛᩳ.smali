.class public final synthetic Ll/֡ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/۫ۨᩳ;

.field public final synthetic ۧ:Ll/۟᩺ᩳ;

.field public final synthetic ܽ:Ll/ۗۤᩳ;

.field public final synthetic ܿ:I

.field public final synthetic ᩳ:Ll/ۗۤᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/ۗۤᩳ;Ll/ۗۤᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۛᩳ;->֫:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/֡ۛᩳ;->ۧ:Ll/۟᩺ᩳ;

    iput-object p3, p0, Ll/֡ۛᩳ;->ܽ:Ll/ۗۤᩳ;

    iput-object p4, p0, Ll/֡ۛᩳ;->ᩳ:Ll/ۗۤᩳ;

    iput p5, p0, Ll/֡ۛᩳ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 0
    iget-object v0, p0, Ll/֡ۛᩳ;->ᩳ:Ll/ۗۤᩳ;

    iget v1, p0, Ll/֡ۛᩳ;->ܿ:I

    iget-object v2, p0, Ll/֡ۛᩳ;->֫:Ll/۫ۨᩳ;

    iget-object v3, p0, Ll/֡ۛᩳ;->ۧ:Ll/۟᩺ᩳ;

    iget-object v4, p0, Ll/֡ۛᩳ;->ܽ:Ll/ۗۤᩳ;

    invoke-static {v2, v3, v4, v0, v1}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/ۗۤᩳ;Ll/ۗۤᩳ;I)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
