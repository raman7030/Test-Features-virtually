.class public final Ll/۠ᩴ᩻;
.super Ljava/lang/Object;
.source "Y89V"

# interfaces
.implements Ll/֨᩷᩻;


# instance fields
.field public final synthetic ᩸:Ll/۫ۡ᩵;


# direct methods
.method public constructor <init>(Ll/۫ۡ᩵;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ᩴ᩻;->᩸:Ll/۫ۡ᩵;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/۠ᩴ᩻;->᩸:Ll/۫ۡ᩵;

    check-cast v0, Ll/ۧ֨᩵;

    invoke-virtual {v0}, Ll/ۧ֨᩵;->close()V

    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 84
    iget-object v0, p0, Ll/۠ᩴ᩻;->᩸:Ll/۫ۡ᩵;

    check-cast v0, Ll/ۧ֨᩵;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۧ֨᩵;->read([BII)I

    move-result p1

    return p1
.end method

.method public final seek(J)V
    .locals 1

    .line 94
    iget-object v0, p0, Ll/۠ᩴ᩻;->᩸:Ll/۫ۡ᩵;

    check-cast v0, Ll/ۧ֨᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۧ֨᩵;->seek(J)V

    return-void
.end method

.method public final synthetic ֫([B)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚ᩷᩻;->֫(Ll/֨᩷᩻;[B)I

    move-result p1

    return p1
.end method
