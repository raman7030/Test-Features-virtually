.class public final Ll/᩸ܶۧ;
.super Ll/ۛܶۧ;
.source "A4UI"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 240
    new-instance v0, Ll/ܶܶۧ;

    .line 241
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 240
    sput-object v0, Ll/᩸ܶۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 2237
    invoke-direct {p0, v0}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 2233
    invoke-direct {p0, p1}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcel;)V

    .line 257
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 258
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Ll/᩸ܶۧ;->᩸:Ljava/util/HashSet;

    .line 259
    new-array v0, v0, [Ljava/lang/String;

    .line 260
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringArray([Ljava/lang/String;)V

    .line 262
    iget-object p1, p0, Ll/᩸ܶۧ;->᩸:Ljava/util/HashSet;

    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 271
    invoke-super {p0, p1, p2}, Landroid/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 272
    iget-object p2, p0, Ll/᩸ܶۧ;->᩸:Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 273
    iget-object p2, p0, Ll/᩸ܶۧ;->᩸:Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return-void
.end method
