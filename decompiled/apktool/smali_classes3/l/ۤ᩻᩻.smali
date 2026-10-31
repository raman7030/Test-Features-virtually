.class public final synthetic Ll/ۤ᩻᩻;
.super Ljava/lang/Object;
.source "L8GV"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܰ᩻᩻;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:I


# direct methods
.method public synthetic constructor <init>(Ll/ܰ᩻᩻;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩻᩻;->֫:Ll/ܰ᩻᩻;

    iput p2, p0, Ll/ۤ᩻᩻;->ۧ:I

    iput p3, p0, Ll/ۤ᩻᩻;->ܽ:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Ll/ۤ᩻᩻;->ۧ:I

    iget v1, p0, Ll/ۤ᩻᩻;->ܽ:I

    iget-object v2, p0, Ll/ۤ᩻᩻;->֫:Ll/ܰ᩻᩻;

    invoke-static {v2, v0, v1}, Ll/ܰ᩻᩻;->֫(Ll/ܰ᩻᩻;II)[B

    move-result-object v0

    return-object v0
.end method
