.class public final synthetic Ll/ᩴ֫֨;
.super Ljava/lang/Object;
.source "C5BI"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/֨֫֨;


# direct methods
.method public synthetic constructor <init>(Ll/֨֫֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ֫֨;->᩸:Ll/֨֫֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 196
    iget-object v0, p0, Ll/ᩴ֫֨;->᩸:Ll/֨֫֨;

    iget-object v1, v0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v0, v0, Ll/֨֫֨;->ۜۧ:I

    invoke-virtual {v1, v0}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
