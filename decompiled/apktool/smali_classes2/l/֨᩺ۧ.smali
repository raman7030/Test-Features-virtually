.class public abstract Ll/֨᩺ۧ;
.super Ll/ۚ᩺ۧ;
.source "G5V7"


# instance fields
.field public ֫:I

.field public ۧ:[Ll/ܿ۬;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1693
    invoke-direct {p0, v0}, Ll/ۚ᩺ۧ;-><init>(I)V

    const/4 v1, 0x0

    .line 1687
    iput-object v1, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    .line 1690
    iput v0, p0, Ll/֨᩺ۧ;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/֨᩺ۧ;)V
    .locals 2

    const/4 v0, 0x0

    .line 1719
    invoke-direct {p0, v0}, Ll/ۚ᩺ۧ;-><init>(I)V

    const/4 v1, 0x0

    .line 1687
    iput-object v1, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    .line 1690
    iput v0, p0, Ll/֨᩺ۧ;->֫:I

    .line 1720
    iget-object v0, p1, Ll/֨᩺ۧ;->ܽ:Ljava/lang/String;

    iput-object v0, p0, Ll/֨᩺ۧ;->ܽ:Ljava/lang/String;

    .line 1722
    iget-object p1, p1, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    invoke-static {p1}, Ll/ܳ۬;->֫([Ll/ܿ۬;)[Ll/ܿ۬;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    return-void
.end method


# virtual methods
.method public getPathData()[Ll/ܿ۬;
    .locals 1

    .line 1750
    iget-object v0, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    .line 1733
    iget-object v0, p0, Ll/֨᩺ۧ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Ll/ܿ۬;)V
    .locals 1

    .line 1755
    iget-object v0, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    invoke-static {v0, p1}, Ll/ܳ۬;->֫([Ll/ܿ۬;[Ll/ܿ۬;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1757
    invoke-static {p1}, Ll/ܳ۬;->֫([Ll/ܿ۬;)[Ll/ܿ۬;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    return-void

    .line 1759
    :cond_0
    iget-object v0, p0, Ll/֨᩺ۧ;->ۧ:[Ll/ܿ۬;

    invoke-static {v0, p1}, Ll/ܳ۬;->ۧ([Ll/ܿ۬;[Ll/ܿ۬;)V

    return-void
.end method
